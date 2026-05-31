# |<<

**维修措施 (pam_service_step / nc.vo.am.servicestep.ServicestepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_service_step | 维修措施标识 | pk_service_step | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | step_code | 编码 | step_code | varchar(40) |  | 字符串 (String) |
| 5 | step_name | 名称 | step_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |