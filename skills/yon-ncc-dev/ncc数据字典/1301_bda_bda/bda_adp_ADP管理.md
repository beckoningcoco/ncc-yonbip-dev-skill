# |<<

**ADP管理 (bda_adp / uap.vo.bda.adpm.adp.entity.AdpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adp | 归档数据包主键 | pk_adp | char(20) | √ | 主键 (UFID) |
| 2 | adpcode | 编码 | adpcode | varchar(50) |  | 字符串 (String) |
| 3 | adpname | 名称 | adpname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_bizobj | 业务对象 | pk_bizobj | varchar(20) |  | 业务对象 (bda_bizobj) |
| 5 | tablefix | 归档表后缀 | tablefix | varchar(50) |  | 字符串 (String) |
| 6 | datasource | 数据源 | datasource | varchar(20) |  | 数据源 (dataSourceName) |
| 7 | dblink | DBLink | dblink | varchar(200) |  | 备注 (Memo) |
| 8 | dealstatus | 状态 | dealstatus | int |  | 处理状态 (DealStatus) |  | 0=自由; |