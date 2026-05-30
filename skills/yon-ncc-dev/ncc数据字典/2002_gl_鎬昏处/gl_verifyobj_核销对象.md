# |<<

**核销对象 (gl_verifyobj / nc.vo.gl.verifyobj.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verifyobj | 核销对象主表标识 | pk_verifyobj | char(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 科目主键 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 3 | verifyobj_code | 核销对象编码 | verifyobj_code | char(100) |  | 主键 (UFID) |
| 4 | bverifybyass | 按所选辅助核算核销 | bverifybyass | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | begindate | 启用日期 | begindate | char(19) |  | 日期时间 (UFDateTime) |
| 6 | userflag | 启用标志 | userflag | varchar(50) |  | 字符串 (String) |
| 7 | bcontrol | 是否严格控制 | bcontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | verifyperiod | 启用会计区间 | verifyperiod | char(7) |  | 主键 (UFID) |
| 9 | hasverifyno | 是否必须录入核销号 | hasverifyno | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 11 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 12 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(50) |  | 字符串 (String) |
| 13 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 16 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |