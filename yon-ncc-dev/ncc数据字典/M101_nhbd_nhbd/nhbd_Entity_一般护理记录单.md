# |<<

**一般护理记录单 (nhbd_Entity / nc.vo.nhbd.cnemrcareform.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_careform | 一般护理记录单主键 | pk_careform | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_dept | 所属科室 | pk_dept | char(20) |  | 主键 (UFID) |
| 5 | pk_pv | 就诊主键 | pk_pv | char(20) |  | 主键 (UFID) |
| 6 | cre_datetime | 创建时间 | cre_datetime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_psn_cre | 创建人 | pk_psn_cre | varchar(20) |  | 人员基本信息 (psndoc) |