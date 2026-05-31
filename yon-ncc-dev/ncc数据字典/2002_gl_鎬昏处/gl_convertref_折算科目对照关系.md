# |<<

**折算科目对照关系 (gl_convertref / nc.vo.gl.soblink.convertref)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertmap | 对照表标识 | pk_convertmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_src | 来源 | pk_src | char(20) |  | 主键 (UFID) |
| 3 | pk_soblink | 账簿关联表主键 | pk_soblink | varchar(20) |  | 折算账簿关联定义 (soblink) |
| 4 | pk_des | 目的 | pk_des | char(20) |  | 主键 (UFID) |
| 5 | content | 内容标志 | content | int |  | 整数 (Integer) |
| 6 | curr | 特定汇率 | curr | decimal(15, 8) |  | 数值 (UFDouble) |
| 7 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 8 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 9 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 10 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |