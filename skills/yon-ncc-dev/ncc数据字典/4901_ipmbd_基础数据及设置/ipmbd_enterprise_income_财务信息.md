# |<<

**财务信息 (ipmbd_enterprise_income / nc.vo.ipmbd.enterpriseperson.EnterprisePersionIncomeVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income | 财务信息（收入）主键 | pk_income | char(20) | √ | 主键 (UFID) |
| 2 | norigtotalassetsmny | 个人/家庭金融资产合计 | norigtotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | nbasetotalassetsmny | 个人/家庭金融资产合计组织本币 | nbasetotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | ngptotalassetsmny | 个人/家庭金融资产合计集团本币 | ngptotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nalltotalassetsmny | 个人/家庭金融资产合计全局本币 | nalltotalassetsmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | norigpersonalincomemny | 近三年个人年均收入 | norigpersonalincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nbasepersonalincomemny | 近三年个人年均收入组织本币 | nbasepersonalincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ngppersonalincomemny | 近三年个人年均收入集团本币 | ngppersonalincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nallpersonalincomemny | 近三年个人年均收入全局本币 | nallpersonalincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | norighouseholdincomemny | 近三年家庭年均收入 | norighouseholdincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbasehouseholdincomemny | 近三年家庭年均收入组织本币 | nbasehouseholdincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngphouseholdincomemny | 近三年家庭年均收入集团本币 | ngphouseholdincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallhouseholdincomemny | 近三年家庭年均收入全局本币 | nallhouseholdincomemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 15 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 21 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 25 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |