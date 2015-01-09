// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice Touch is licensed to you under the terms described in the
// ICE_TOUCH_LICENSE file included in this distribution.
//
// **********************************************************************

#import <objc/Ice/Logger.h>

#import <Wrapper.h>

#include <IceCpp/Logger.h>

@interface ICELogger : NSObject<ICELogger>
{
}
+(Ice::Logger*)loggerWithLogger:(id<ICELogger>)arg;
+(id) wrapperWithCxxObject:(IceUtil::Shared*)cxxObject;
@end