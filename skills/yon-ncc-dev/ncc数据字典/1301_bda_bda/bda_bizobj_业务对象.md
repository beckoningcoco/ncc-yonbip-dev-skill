# |<<

**业务对象 (bda_bizobj / uap.vo.bda.adpm.bo.entity.BizObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizobj | 业务对象主键 | pk_bizobj | char(20) | √ | 主键 (UFID) |
| 2 | bocode | 编码 | bocode | varchar(50) |  | 字符串 (String) |
| 3 | boname | 名称 | boname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | maintable | 主表名 | maintable | varchar(50) |  | 字符串 (String) |
| 5 | pk_maintable | 表主键 | pk_maintable | varchar(50) |  | 字符串 (String) |
| 6 | dealstatus | 状态 | dealstatus | int |  | 处理状态 (DealStatus) |  | 0=自由; |