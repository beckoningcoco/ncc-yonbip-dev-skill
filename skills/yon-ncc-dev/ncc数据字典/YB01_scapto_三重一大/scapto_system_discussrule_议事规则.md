# |<<

**议事规则 (scapto_system_discussrule / nc.vo.scapto.systemmanage.systemreport.SystemReportDiscussruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_system_discussrule | 议事规则主键 | pk_system_discussrule | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_matterdirectory | 事项编码 | pk_matterdirectory | varchar(20) |  | 事项目录设置 (MatterDirectoryVO) |
| 4 | attendancerate | 应出席人数占比 | attendancerate | varchar(50) |  | 字符串 (String) |
| 5 | voteway | 表决方式 | voteway | varchar(50) |  | 表决方式 (VotewayEnum) |  | 1=赞成票超过应到会成员人数的4/5; |