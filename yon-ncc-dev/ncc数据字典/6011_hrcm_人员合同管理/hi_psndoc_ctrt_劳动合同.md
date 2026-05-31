# |<<

**劳动合同 (hi_psndoc_ctrt / nc.vo.hrcm.hrcm_center.CtrtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 合同主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnorg | 组织关系 | pk_psnorg | char(20) |  | 主键 (UFID) |
| 4 | pk_psnjob | 任职记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 5 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_org | 业务发生组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 8 | contractnum | 合同编号 | contractnum | varchar(28) | √ | 字符串 (String) |
| 9 | conttype | 业务类型 | conttype | int | √ | 签订类型 (ContType) |  | 1=签订; |