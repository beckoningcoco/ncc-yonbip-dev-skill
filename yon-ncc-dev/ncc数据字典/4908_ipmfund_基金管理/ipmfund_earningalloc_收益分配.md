# |<<

**收益分配 (ipmfund_earningalloc / nc.vo.ipmfund.earningalloc.EarningAllocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3296.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_earningalloc | 收益分配主键 | pk_earningalloc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 记录人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | pk_fundlib | 分配主体 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 9 | valloctype | 分配类型 | valloctype | varchar(50) |  | 收益分配类型 (EarningAllocTypeEnum) |  | 1=分红收益; |