## CREATED TO MAKE EASY GENERATE PROTOBUFF CODES FOR GO ##

gen: 
	protoc --proto_path=grpc_go/proto grpc_go/proto/*.proto --go_out=:grpc_go/pb --go-grpc_out=:grpc_go/pb
	# protoc --proto_path=proto proto/*.proto --go_out=:pb --go-grpc_out=:pb

clean:
	rm grpc_go/pb/*.go

run:
	go run grpc_go/main.go