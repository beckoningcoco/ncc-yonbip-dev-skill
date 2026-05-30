# |<<

**地区分类 (bd_areacl / nc.vo.bd.cust.areaclass.AreaclassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_areacl | 地区分类主键 | pk_areacl | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 地区分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 地区分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | ename | 外文名称 | ename | varchar(200) |  | 字符串 (String) |
| 7 | pk_fatherarea | 上级地区分类 | pk_fatherarea | varchar(20) |  | 地区分类 (areaclass) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | innercode | 内部码 | innercode | varchar(60) |  | 字符串 (String) |
| 10 | seq | seq | seq | varchar(20) |  | 字符串 (String) |
| 11 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |