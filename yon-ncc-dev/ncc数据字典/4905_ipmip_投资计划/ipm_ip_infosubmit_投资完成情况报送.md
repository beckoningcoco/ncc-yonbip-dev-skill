# |<<

**投资完成情况报送 (ipm_ip_infosubmit / nc.vo.ipmip.infosubmit.InfoSubmitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3180.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infosubmit | 主键 | pk_infosubmit | char(20) | √ | 主键 (UFID) |
| 2 | bisgathered | 已汇总 | bisgathered | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_dept | 报送部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_dept_v | 报送部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | pk_psndoc | 报送人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | vbillcode | 报送编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | vbillname | 报送名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 11 | vyear | 年度 | vyear | varchar(20) |  | 字符串 (String) |
| 12 | vquarter | 季度 | vquarter | varchar(50) |  | 季度 (ipmQuarter) |  | 1=一季度; |