# |<<

**包装箱类型 (ic_packtype / nc.vo.scmf.ic.mpacktype.PackTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2951.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpacktypeid | 包装箱类型主键 | cpacktypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | vcode | 包装箱类型编码 | vcode | varchar(20) | √ | 字符串 (String) |
| 4 | vname | 包装箱类型名称 | vname | varchar(20) | √ | 多语文本 (MultiLangText) |
| 5 | vspec | 规格 | vspec | varchar(20) |  | 字符串 (String) |
| 6 | nvolumn | 容积 | nvolumn | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | nlength | 包装箱长 | nlength | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | nwidth | 包装箱宽 | nwidth | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | nheight | 包装箱高 | nheight | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 11 | pk_packsort | 包装分类主键 | pk_packsort | varchar(20) |  | 包装分类档案 (PackingTypeVO) |
| 12 | pk_org | 公司 | pk_org | char(20) | √ | 组织_业务单元_公司 (corp) |
| 13 | venname | 英文名称 | venname | varchar(20) |  | 字符串 (String) |
| 14 | nmaxweight | 限重 | nmaxweight | decimal(20, 8) |  | 数值 (UFDouble) |
| 15 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |