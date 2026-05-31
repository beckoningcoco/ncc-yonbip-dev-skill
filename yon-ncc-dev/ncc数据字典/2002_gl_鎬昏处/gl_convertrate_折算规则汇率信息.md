# |<<

**折算规则汇率信息 (gl_convertrate / nc.vo.gl.soblink.convertrate)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertrate | 汇率信息标识 | pk_convertrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_accsubj | 会计科目 | pk_accsubj | char(20) |  | 主键 (UFID) |
| 3 | pk_subjtype | 科目类别 | pk_subjtype | char(20) |  | 主键 (UFID) |
| 4 | ratetype | 汇率类别 | ratetype | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | rate | 汇率 | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 6 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 7 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 8 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |