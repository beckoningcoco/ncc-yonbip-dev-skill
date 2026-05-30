# |<<

**医保对照中间表 (nhhp_mid_yp / com.yonyou.yh.nhis.hp.zzhp.pub.country.vo.NHHPMIDYPVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mid | 主键 | pk_mid | char(20) | √ | 主键 (UFID) |
| 2 | xh | 序号 | xh | varchar(50) |  | 字符串 (String) |
| 3 | xmbm | 项目编码 | xmbm | varchar(50) |  | 字符串 (String) |
| 4 | lb | 类别 | lb | varchar(50) |  | 字符串 (String) |
| 5 | fylx | 费用类型 | fylx | varchar(50) |  | 字符串 (String) |
| 6 | xmmc | 项目名称 | xmmc | varchar(50) |  | 字符串 (String) |
| 7 | xmnh | 项目内涵 | xmnh | varchar(50) |  | 字符串 (String) |
| 8 | pym | 拼音码 | pym | varchar(50) |  | 字符串 (String) |
| 9 | dw | 单位 | dw | varchar(50) |  | 字符串 (String) |
| 10 | jsbl | 计算比例 | jsbl | varchar(50) |  | 字符串 (String) |
| 11 | jx | 剂型 | jx | varchar(50) |  | 字符串 (String) |
| 12 | bz | 备注 | bz | varchar(50) |  | 字符串 (String) |
| 13 | ssjxz | 省市级限制 | ssjxz | varchar(50) |  | 字符串 (String) |
| 14 | xqjxz | 县区级限制 | xqjxz | varchar(50) |  | 字符串 (String) |
| 15 | xzjxz | 乡镇级限制 | xzjxz | varchar(50) |  | 字符串 (String) |
| 16 | zgxjxzj | 最高限价乡镇级 | zgxjxzj | varchar(50) |  | 字符串 (String) |
| 17 | zgxjxj | 最高限价县级 | zgxjxj | varchar(50) |  | 字符串 (String) |
| 18 | zgxjshij | 最高限价市级 | zgxjshij | varchar(50) |  | 字符串 (String) |
| 19 | zgxjshenj | 最高限价省级 | zgxjshenj | varchar(50) |  | 字符串 (String) |
| 20 | xmbclx | 项目补偿类型 | xmbclx | varchar(50) |  | 字符串 (String) |
| 21 | bcffsy | 补偿复方使用 | bcffsy | varchar(50) |  | 字符串 (String) |
| 22 | sfbl | 首付比例 | sfbl | varchar(50) |  | 字符串 (String) |