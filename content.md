Content about the course:

Used command to install grpc go library:
```
$ export GO111MODULE=on  # Enable module mode
$ go get google.golang.org/protobuf/cmd/protoc-gen-go \
         google.golang.org/grpc/cmd/protoc-gen-go-grpc
```
Commando to export the gopath
```
export PATH="$PATH:$(go env GOPATH)/bin"
```

```
protoc \
  --proto_path=proto proto/*.proto \
  --go_out=:pb/ \
  --go-grpc_out=:pb
```