# |<<

**证书授予单位 (hr_trankunit / nc.vo.hr.certificatefile.TrankUnitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctfunit | 证书授予单位主键 | pk_ctfunit | char(20) | √ | 主键 (UFID) |
| 2 | pk_ctffile | 证书档案主键 | pk_ctffile | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 5 | expireddate | 授权失效日期 | expireddate | varchar(19) |  | 日期 (UFDate) |
| 6 | vmemo | 备注 | vmemo | varchar(500) |  | 备注 (Memo) |