<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:resourceURL var="urlListadoLiferay"/>

<div id="Tabla"></div>

<script type="text/javascript">
	YUI().ready('aui-datatable', 'aui-io-request', function(Y) {
			
		var columns = [ 'userId', 'screenName'];
		Y.io.request('<%= urlListadoLiferay%>', {
			on : {
				success : function() {
					var data = this.get('responseData');
					
					data=JSON.parse(data);

					new Y.DataTable.Base({
						columnset : columns,
						recordset : data.list
						}
					).render('#Tabla');
				}
			}
		}
	);

	}
	);
</script>