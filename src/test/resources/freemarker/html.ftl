<#macro html title charset="utf-8" lang="zh-CN">
 <html> 
 <head> 
  <meta http-equiv="Content-Type" content="text/html; charset=${charset}" /> 
  <meta http-equiv="Content-Language" content="${lang}"/> 
  <title>${title}</title> 
 </head> 
 <body> 
    <#nested> 
 </body> 
 </html> 
 </#macro>