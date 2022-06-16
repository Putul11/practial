package com.jid.GFG;

public class DirtyResource implements AutoCloseable{
	    public void accessResource()
	    {
	        throw new RuntimeException("I wanted to access this resource. Bad luck. Its dirty resource !!!");
	    }
	 
	    
	    @Override
	    public void close() throws Exception
	    {
	        throw new NullPointerException("Remember me. I am your worst nightmare !! I am Null pointer exception !!");
	    }
}



