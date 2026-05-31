# |<<

**业务对象 (lcdp_busi_doc / nc.vo.lcdp.pub.doc.BusiDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3540.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | pk_doc | pk_doc | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | doc_tablename | 对应表名 | doc_tablename | varchar(50) |  | 字符串 (String) |
| 5 | fulltablename | 完整表名 | fulltablename | varchar(50) |  | 字符串 (String) |
| 6 | pubmeta | 是否已发布元数据 | pubmeta | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pubapp | 是否已发布应用 | pubapp | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_busitype | 业务对象类型 | pk_busitype | varchar(20) |  | 业务对象类型 (busitype) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_metadata | 发布的元数据 | pk_metadata | varchar(50) |  | 字符串 (String) |
| 12 | pk_parent | 父业务对象 | pk_parent | varchar(20) |  | 业务对象 (busi_doc) |
| 13 | busilist | 包含特性 | busilist | varchar(1000) |  | 字符串 (String) |
| 14 | pubstatus | 发布状态 | pubstatus | varchar(50) |  | 字符串 (String) |
| 15 | version | 版本 | version | int |  | 整数 (Integer) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |