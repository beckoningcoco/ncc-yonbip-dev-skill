# |<<

**规则 (bd_batchupdaterule / nc.vo.bd.pub.batchupdaterule.BatchUpdateRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupdaterule | 主键 | pk_batchupdaterule | char(20) | √ | 主键 (UFID) |
| 2 | mainattrcode | 修改主属性 | mainattrcode | varchar(200) |  | 字符串 (String) |
| 3 | memo | 规则描述 | memo | varchar(500) |  | 字符串 (String) |
| 4 | sqlxmlcondition | 批改条件 | sqlxmlcondition | image |  | BLOB (BLOB) |
| 5 | pk_batchupdatetab | 属性所在页签 | pk_batchupdatetab | varchar(20) |  | 批改页签 (batchupdatetab) |
| 6 | updateattrandvalue | 修改属性和值 | updateattrandvalue | image |  | BLOB (BLOB) |
| 7 | isonlyupdatenull | 是否仅修改为空的属性值 | isonlyupdatenull | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | executor | 最后执行人 | executor | varchar(20) |  | 用户 (user) |
| 9 | executetime | 最后执行时间 | executetime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |