<#function avg nums...>
    <#local sum = 0>
    <#list nums as num>
        <#local sum = sum + num>
    </#list>
    <#if nums?size != 0>
        <#return sum / nums?size>
    </#if>
</#function>
${avg(10, 20)}