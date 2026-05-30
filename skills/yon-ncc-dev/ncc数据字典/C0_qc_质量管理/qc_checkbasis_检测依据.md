# |<<

**检测依据 (qc_checkbasis / nc.vo.qc.checkbasis.entity.BasisHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkbasis | 检测依据主键 | pk_checkbasis | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vbasiscode | 检测依据编码 | vbasiscode | varchar(50) |  | 字符串 (String) |
| 4 | vbasisname | 检测依据名称 | vbasisname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | dvaliddate | 有效期 | dvaliddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 6 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |