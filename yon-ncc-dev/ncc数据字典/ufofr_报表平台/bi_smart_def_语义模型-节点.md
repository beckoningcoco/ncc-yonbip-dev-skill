# |<<

**语义模型-节点 (bi_smart_def / nc.vo.smart.SmartDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1215.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_def | 定义主键 | pk_def | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 语义模型分类 | pk_dir | varchar(20) |  | 语义模型分类 (smartdir) |
| 3 | defcode | 语义模型编码 | defcode | varchar(50) |  | 字符串 (String) |
| 4 | defname | 语义模型名称 | defname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | owner | 所有者 | owner | char(20) |  | 主键 (UFID) |
| 6 | dsname | 数据源 | dsname | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |