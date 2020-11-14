# rmi

## Cách chạy project

### Build code
`javac *.java`

### Create Stub
`rmic HelloImpl`

### Register Port

`rmiregistry 5000`

### Run server
Mở một terminal khác và chạy lệnh
`java HelloImpl`

### Run client
Mở một terminal khác và chạy lệnh
`java RMIClient`
