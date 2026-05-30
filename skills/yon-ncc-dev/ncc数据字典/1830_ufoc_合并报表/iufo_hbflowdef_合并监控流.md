# |<<

**合并监控流 (iufo_hbflowdef / nc.vo.hbbb.hbflow.HBFlowDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3450.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbflowdef | 合并监控流主键 | pk_hbflowdef | char(20) | √ | 主键 (UFID) |
| 2 | code | 合并监控流编码 | code | varchar(100) |  | 字符串 (String) |
| 3 | name | 合并监控流名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_hbscheme | 对应合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |