// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package test.Ice.seqMapping;

public class AMDServer extends test.Util.Application
{
    @Override
    public int
    run(String[] args)
    {
        Ice.ObjectAdapter adapter = communicator().createObjectAdapter("TestAdapter");
        adapter.add(new AMDMyClassI(), Ice.Util.stringToIdentity("test"));
        adapter.activate();

        return WAIT;
    }

    @Override
    protected Ice.InitializationData getInitData(Ice.StringSeqHolder argsH)
    {
        Ice.InitializationData initData = super.getInitData(argsH);
        initData.properties.setProperty("Ice.Package.Test", "test.Ice.seqMapping.AMD");
        initData.properties.setProperty("TestAdapter.Endpoints", getTestEndpoint(initData.properties, 0) + ":udp");
        return initData;
    }

    public static void main(String[] args)
    {
        AMDServer c = new AMDServer();
        int status = c.main("AMDServer", args);

        System.gc();
        System.exit(status);
    }
}
