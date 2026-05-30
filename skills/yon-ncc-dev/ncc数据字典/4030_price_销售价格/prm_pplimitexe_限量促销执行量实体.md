# |<<

**限量促销执行量实体 (prm_pplimitexe / nc.vo.price.pplimitexe.PPLimitExeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pplimitexe | 促销限量执行量实体 | pk_pplimitexe | char(20) | √ | 主键 (UFID) |
| 2 | cpromotepriceid | 促销价格表ID | cpromotepriceid | varchar(20) |  | 促销价格实体 (prm_promoteprice) |
| 3 | vbilltypecode | 询价单据类型编码 | vbilltypecode | varchar(20) |  | 字符串 (String) |
| 4 | cfindpricebillbid | 询价行id | cfindpricebillbid | varchar(20) |  | 字符串 (String) |
| 5 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 6 | nthisexechgnum | 本次执行变化量 | nthisexechgnum | decimal(28, 8) |  | 数值 (UFDouble) |