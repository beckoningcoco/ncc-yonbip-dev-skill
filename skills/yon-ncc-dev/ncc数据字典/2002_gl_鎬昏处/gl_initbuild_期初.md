# |<<

**期初 (gl_initbuild / nc.vo.gl.init.initbuild)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initbuild | 期初标识 | pk_initbuild | char(20) | √ | 主键 (UFID) |
| 2 | pk_setofbook | 核算账簿 | pk_setofbook | varchar(0) |  | 账簿_账簿类型 (setofbook) |
| 3 | builtyear | 建账年度 | builtyear | char(4) |  | 字符串 (String) |
| 4 | pk_accountingbook | 帐簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |