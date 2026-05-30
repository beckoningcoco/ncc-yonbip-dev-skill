# |<<

**故障树 (pam_failure_tree / nc.vo.am.failuretree.FailuretreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_tree | 故障树标识 | pk_failure_tree | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 父节点标识 | pk_parent | varchar(20) |  | 故障树 (failuretree) |
| 3 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(400) |  | 多语文本 (MultiLangText) |
| 5 | pk_failure_type | 故障类别 | pk_failure_type | varchar(20) |  | 故障类别 (failuretype) |
| 6 | pk_failure_symptom | 故障现象 | pk_failure_symptom | varchar(20) |  | 故障现象 (failuresymptom) |
| 7 | pk_failure_reason | 故障原因 | pk_failure_reason | varchar(20) |  | 故障原因 (failurereason) |
| 8 | pk_service_step | 维修措施 | pk_service_step | varchar(20) |  | 维修措施 (servicestep) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |