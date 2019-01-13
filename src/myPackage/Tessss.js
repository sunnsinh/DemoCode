	$(document).on("click",'*[id*=invoiceSlip-]', function() {
			if($('.invoiceDropdown').is(':visible'))
			{
				var Id=$(this).attr('id');

				//PWS-10811
				var orderId = $(this).attr('id').split(/-(.+)/)[1];
				if($("#"+Id).attr('data-load') == "yes")
				{

					$.ajax({
						url : invoiceSlipUrl,
						type : 'GET',
						dataType: "html",
						data :{orderCode:orderId},
						beforeSend: function() {

							$('body').css({'cursor':'wait'});

						},

						success : function(messageData) {
							$('body').css({'cursor':'auto'});
							$( "#invoiceSlipDropDown-"+orderId).html(messageData); $("#"+Id).attr("data-load","no");
							//$(this).next('.invoiceDropdown').toggle();

						},
						error : function(error) {
							console.error("acc.orderHistory.js :"+error.status);										
						}
					});
				}
			}

		});
	
	$.ajax({
		url : xyz,
		
		success : function(data)
		{
			
		},
		error
	});