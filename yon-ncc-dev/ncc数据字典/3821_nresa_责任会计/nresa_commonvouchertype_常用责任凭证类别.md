# |<<

**常用责任凭证类别 (nresa_commonvouchertype / nc.vo.nresa.commonvouchertype.CommonVoucherTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3839.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commontype | 常用凭证主键 | pk_commontype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 4 | remark | 说明 | remark | varchar(200) |  | 备注 (Memo) |
| 5 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifytime | 修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_accountingbook | 责任核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |