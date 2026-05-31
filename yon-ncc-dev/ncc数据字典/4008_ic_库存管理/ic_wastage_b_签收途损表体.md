# |<<

**签收途损表体 (ic_wastage_b / nc.vo.ic.m4453.entity.WastageBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwastagebid | 签收途损表体主键 | cwastagebid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | fwastdutyflag | 途损责任 | fwastdutyflag | int | √ | 签收途损责任 (wastage_duty) |  | 1=客户; |