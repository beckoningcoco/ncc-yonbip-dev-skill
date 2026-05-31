# |<<

**自定义转账本方定义 (gl_transselfdef / nc.vo.gl.transselfdef.transselfdef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2496.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transselfdef | 主键 | pk_transselfdef | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 公司 | pk_corp | char(4) |  | 主键 (UFID) |
| 3 | pk_accountingbook | 核算账簿pk | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 组织pk | pk_group | char(20) |  | 主键 (UFID) |
| 5 | pk_org | 财务组织pk | pk_org | char(20) |  | 主键 (UFID) |
| 6 | guideclass | 引导类 | guideclass | varchar(101) |  | 自定义项 (Custom) |
| 7 | guidemethod | 引导方法 | guidemethod | varchar(101) |  | 自定义项 (Custom) |
| 8 | runclass | 运行类 | runclass | varchar(101) |  | 自定义项 (Custom) |
| 9 | runmethod | 运行方法 | runmethod | varchar(101) |  | 自定义项 (Custom) |
| 10 | memo | 备注 | memo | varchar(101) |  | 自定义项 (Custom) |
| 11 | functionname | 函数名称 | functionname | varchar(101) |  | 自定义项 (Custom) |
| 12 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |