# |<<

**任务管理 (tb_md_task / nc.vo.tb.task.MdTask)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5730.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objname | 名称 | objname | varchar(200) |  | 字符串 (String) |
| 3 | pk_taskdef | 所属任务模板 | pk_taskdef | varchar(20) |  | 任务模板 (tbb_taskdef) |
| 4 | pk_workbook | 对应套表 | pk_workbook | varchar(50) |  | 字符串 (String) |
| 5 | pk_year | 年 | pk_year | varchar(50) |  | 字符串 (String) |
| 6 | pk_month | 月 | pk_month | varchar(50) |  | 字符串 (String) |
| 7 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 8 | pk_mvtype | 业务方案 | pk_mvtype | varchar(20) |  | 业务方案 (tb_dataattr) |
| 9 | pk_version | 版本 | pk_version | varchar(20) |  | 版本 (tb_version) |
| 10 | pk_planent | 编制主体 | pk_planent | varchar(20) |  | 组织 (org) |
| 11 | pk_dataent | 责任主体 | pk_dataent | varchar(20) |  | 组织 (org) |
| 12 | pk_paradims | 其他参数维 | pk_paradims | varchar(50) |  | 字符串 (String) |
| 13 | pk_orgstruct | 组织体系 | pk_orgstruct | varchar(50) |  | 字符串 (String) |
| 14 | sheetlist | 可用表单 | sheetlist | text(0) |  | BLOB (BLOB) |
| 15 | planstatus | 任务流程状态 | planstatus | varchar(50) |  | 预算任务状态 (tbb_taskstatus) |  | 000=未启动; |