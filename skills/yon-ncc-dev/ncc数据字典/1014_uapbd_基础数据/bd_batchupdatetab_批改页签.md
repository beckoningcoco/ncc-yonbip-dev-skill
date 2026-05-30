# |<<

**批改页签 (bd_batchupdatetab / nc.vo.bd.pub.batchupdate.BatchUpdateTabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupdatetab | 主键 | pk_batchupdatetab | char(20) | √ | 主键 (UFID) |
| 2 | mdid | 元数据主键 | mdid | varchar(36) | √ | 字符串 (String) |
| 3 | code | 页签编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 页签名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | residpath | 名称多语目录 | residpath | varchar(100) |  | 字符串 (String) |
| 6 | resid | 名称多语ID | resid | varchar(50) |  | 字符串 (String) |
| 7 | ismaintab | 是主页签 | ismaintab | char(1) | √ | 布尔类型 (UFBoolean) |
| 8 | nodekey | 页签对应模板的nodekey | nodekey | varchar(50) |  | 字符串 (String) |
| 9 | orgrefprovider | 组织参照服务全类名 | orgrefprovider | varchar(200) | √ | 字符串 (String) |
| 10 | showorder | 显示顺序 | showorder | smallint | √ | 整数 (Integer) |