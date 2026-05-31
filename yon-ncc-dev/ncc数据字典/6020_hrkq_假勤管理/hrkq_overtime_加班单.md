# |<<

**加班单 (hrkq_overtime / nccloud.vo.hrkq.overtime.OverTimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2718.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_overtime | 主键 | pk_overtime | varchar(50) | √ | 字符串 (String) |
| 2 | pk_psndoc | 申请人 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | billmaker | 制单人 | billmaker | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 6 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | otapplylength | 加班时长 | otapplylength | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | billsource | 单据来源 | billsource | int |  | 单据来源 (billsource) |  | 0=申请单; |