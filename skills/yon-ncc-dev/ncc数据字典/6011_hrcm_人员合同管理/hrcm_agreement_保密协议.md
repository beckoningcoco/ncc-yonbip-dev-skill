# |<<

**保密协议 (hrcm_agreement / nc.vo.hrcm.agreement.SecrerycontVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agreement | 协议主键 | pk_agreement | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员 | pk_psndoc | varchar(0) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 任职记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | pk_psnorg | 组织关系 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 5 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_org | 业务发生组织 | pk_org | varchar(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 7 | contcode | 保密协议编号 | contcode | varchar(30) | √ | 字符串 (String) |
| 8 | agreementtype | 协议类型 | agreementtype | varchar(50) |  | 协议类型 (agreementtype) |  | postcont=岗位协议; |