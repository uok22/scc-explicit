org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'GET'
		url '/my-context-path/url'
	}
	response {
		status OK()
	}
}