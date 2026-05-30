# |<<

**元数据转换模板分配关系 (fip_templateassign / nc.vo.fip.templateassign.TemplateassignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign | 对象标识 | pk_assign | char(20) | √ | 主键 (UFID) |
| 2 | pk_transtemplate | 转换模板对象标识 | pk_transtemplate | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | src_billtype | 上游单据类型 | src_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | src_org | 上游业务单元 | src_org | varchar(20) |  | 组织 (org) |
| 8 | des_billtype | 生成目标 | des_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | account_type | 账簿类型 | account_type | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 10 | pk_glsumrule | 合并方案（总账） | pk_glsumrule | varchar(101) |  | 自定义项 (Custom) |
| 11 | pk_rasumrule | 合并方案（责任） | pk_rasumrule | varchar(101) |  | 自定义项 (Custom) |
| 12 | glvouchertype | 总账凭证类别 | glvouchertype | varchar(101) |  | 自定义项 (Custom) |
| 13 | ravouchertype | 责任凭证类别 | ravouchertype | varchar(101) |  | 自定义项 (Custom) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |