# |<<

**薪资档案 (wa_data / nc.vo.wa.payfile.PayfileVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_data | 薪资档案主键 | pk_wa_data | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 人员工作信息 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | pk_psnorg | 组织关系主键 | pk_psnorg | char(20) |  | 主键 (UFID) |
| 5 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_wa_class | 薪资类别主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 9 | cyear | 年度 | cyear | char(4) |  | 主键 (UFID) |
| 10 | cperiod | 期间 | cperiod | char(2) |  | 主键 (UFID) |
| 11 | taxtype | 扣税方式 | taxtype | int |  | 扣税方式 (taxtype) | 0 | 0=代扣税; |