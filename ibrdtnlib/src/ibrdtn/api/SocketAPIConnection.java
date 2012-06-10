package ibrdtn.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SocketAPIConnection implements APIConnection  {
	
	private java.net.Socket _socket = null;
	private String _host = "localhost";
	private int _port = 4550;
	
	public SocketAPIConnection()
	{
	}
	
	public SocketAPIConnection(String host, int port)
	{
		this._host = host;
		this._port = port;
	}
	
	@Override
	public void open() throws IOException
	{
		if (_socket != null)
		{
			_socket.close();
		}
		_socket = new java.net.Socket(this._host, this._port);
	}

	@Override
	public Boolean isConnected() {
		if (_socket == null) return false;
		return _socket.isConnected();
	}

	@Override
	public Boolean isClosed() {
		if (_socket == null) return true;
		return _socket.isClosed();
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return _socket.getOutputStream();
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return _socket.getInputStream();
	}

	@Override
	public void close() throws IOException {
		if (_socket != null) _socket.close();
	}

}
