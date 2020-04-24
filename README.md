# Repo to reproduce "Invalid hook call error"

The error is
```
Error: Invalid hook call. Hooks can only be called inside of the body of a function component. This could happen for one of the following reasons:
1. You might have mismatching versions of React and the renderer (such as React DOM)
2. You might be breaking the Rules of Hooks
3. You might have more than one copy of React in the same app

The above error occurred in the <WithStyles(ForwardRef(Button))> component:
    in WithStyles(ForwardRef(Button))
```

and this repo is the minimal configuration I get to reproduce the problem, I was
using the package `material-ui` in previous versions and never got this error. I
suspect it might be a mismatch of version but I couldn't figure this out. I'd
appreciate some help.

## Running

`npm install` - Need when running the code for the first time. It install node packages dependencies.

`npx webpack --mode=development` - Need when running the code for the first time. Bundle the external javascript code into the index.bundle.js.

`lein fig:prod-repl` - It runs the project with production configuration, with a
repl available and with fighweel auto reload. You can check the page
http://penguin.linux.test:8378/ or http://localhost:8378/

## Note

In `figwheel-main.edn` there's a `:connect-url` config because I use linux in a
chromebook, so you might need to delete it to access the localhost.
