# |<<

**批改属性 (bd_batchupdateattr / nc.vo.bd.pub.batchupdate.BatchUpdateAttrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupdateattr | 主键 | pk_batchupdateattr | char(20) | √ | 主键 (UFID) |
| 2 | code | 属性编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 属性名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | relatedattr | 连带批改的属性 | relatedattr | varchar(200) |  | 字符串 (String) |
| 5 | editlistener | 编辑监听器 | editlistener | varchar(200) |  | 字符串 (String) |
| 6 | validator | 校验器 | validator | varchar(200) |  | 字符串 (String) |
| 7 | service | 批改服务 | service | varchar(200) | √ | 字符串 (String) |
| 8 | issingleorg | 只能单组织下批改 | issingleorg | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | showorder | 显示顺序 | showorder | smallint | √ | 整数 (Integer) |