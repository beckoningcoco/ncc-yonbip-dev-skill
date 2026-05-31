# |<<

**流水号 (hr_ctfflownumber / nc.vo.hr.certificatefile.FlowNumberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2662.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 流水号主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_ctffile | 证书档案主键 | pk_ctffile | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 5 | flownumber | 流水号 | flownumber | varchar(100) |  | 字符串 (String) |
| 6 | flowlength | 流水号长度 | flowlength | varchar(50) |  | 字符串 (String) |