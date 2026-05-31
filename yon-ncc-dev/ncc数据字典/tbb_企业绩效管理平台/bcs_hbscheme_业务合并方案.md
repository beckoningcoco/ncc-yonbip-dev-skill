# |<<

**业务合并方案 (bcs_hbscheme / nc.vo.bcs.hbscheme.BMHBSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbscheme | 合并方案主键 | pk_hbscheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 合并方案编号 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_repmanastru | 合并管理结构 | pk_repmanastru | varchar(20) |  | 组织结构_报表合并体系 (reportcombinestru) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |