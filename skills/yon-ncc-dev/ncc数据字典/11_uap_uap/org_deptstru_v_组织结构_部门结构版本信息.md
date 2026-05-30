# |<<

**组织结构_部门结构版本信息 (org_deptstru_v / nc.vo.vorg.DeptStruVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 部门结构版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_busiunit | 部门结构所属业务单元 | pk_busiunit | varchar(20) |  | 组织 (org) |
| 3 | vname | 版本名称 | vname | varchar(50) |  | 字符串 (String) |
| 4 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 5 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期 (UFDate) |
| 6 | venddate | 版本失效日期 | venddate | char(19) |  | 日期 (UFDate) |
| 7 | islastversion | 是否最新版本 | islastversion | char(1) |  | 布尔类型 (UFBoolean) |