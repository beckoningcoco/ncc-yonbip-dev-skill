# |<<

**合同信息 (hi_psndoc_ctrt / nc.vo.hi.psndoc.CtrtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 合同主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | contractnum | 合同编号 | contractnum | varchar(28) | √ | 字符串 (String) |
| 3 | conttype | 业务类型 | conttype | int | √ | 签订类型 (ContType) | 1 | 1=签订; |