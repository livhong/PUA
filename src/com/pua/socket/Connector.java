package com.pua.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {

	Socket socket;
	PrintStream ps;
	BufferedReader br;
	
	public Connector(String rIp, String rPort, String lIp, String lPort){
		InetAddress local = null;
		try {
			local = InetAddress.getByName(lIp);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress remote = null;
		try {
			remote = InetAddress.getByName(rIp);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			socket = new Socket(remote, Integer.parseInt(rPort), local, Integer.parseInt(lPort));
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ps = new PrintStream(socket.getOutputStream());
		}catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
	
	public void disconnect(){
		if(socket!=null){
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	//Be sure that this function is included in a forever loop;
	public String getLine(){
		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	public boolean sendLine(String line){
		if(socket!=null){
			ps.println(line);
			ps.flush();
			return true;
		}
		return false;
	}
	
	
}
