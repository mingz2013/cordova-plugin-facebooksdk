#import "FacebookSdkPlugin.h"


@implementation FacebookSdkPlugin

- (void) pluginInitialize {
  [super pluginInitialize];
//  [ALSdk initializeSdk];
  NSLog(@"FacebookSdkPlugin: initialized");
}

- (void) init:(CDVInvokedUrlCommand*)command{
    NSDictionary* params = [command.arguments objectAtIndex:0];


}

@end