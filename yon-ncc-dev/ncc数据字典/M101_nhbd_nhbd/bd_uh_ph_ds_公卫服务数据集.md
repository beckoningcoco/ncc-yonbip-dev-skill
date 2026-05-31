# |<<

**公卫服务数据集 (bd_uh_ph_ds / com.yonyou.yh.nhis.bd.phds.vo.PhDsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1083.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phds | 数据集主键 | pk_phds | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_ph | 公卫领域 | pk_ph | varchar(20) |  | 公卫领域定义 (phdomain) |
| 5 | code | 数据集编码 | code | varchar(30) |  | 字符串 (String) |
| 6 | name | 数据集名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 7 | code_sdt | 国家数据集标准编码 | code_sdt | varchar(30) |  | 字符串 (String) |
| 8 | tblname | 对应物理表名 | tblname | varchar(50) |  | 字符串 (String) |
| 9 | urlname | 对应公卫服务记录单 | urlname | varchar(256) |  | 字符串 (String) |
| 10 | flag_active | 启用标志 | flag_active | varchar(50) |  | 数据集判断 (TruefalseEnum) |  | 0=是; |